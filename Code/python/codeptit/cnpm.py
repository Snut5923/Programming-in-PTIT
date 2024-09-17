import tkinter as tk
from tkinter import ttk
import mysql.connector
# hàm connect đến db với đầu vào là xâu kí tự đại diện cho lệnh truy vấn sql
def connect(s):
    # Thông tin kết nối
    config = {
        'user': 'root',
        'password': '1234',
        'host': 'localhost',
        'database': 'F1',
        'raise_on_warnings': True
    }

    try:
        # Kết nối đến cơ sở dữ liệu
        conn = mysql.connector.connect(**config)

        # Thực hiện các hoạt động với cơ sở dữ liệu
        if conn.is_connected():
            print('Connected to MySQL database')

            # Thực thi một truy vấn SQL
            cursor = conn.cursor()
            cursor.execute(s)

            # Lấy kết quả của truy vấn
            rows = cursor.fetchall()


    #ngoại lệ
    except mysql.connector.Error as e:
        print(f'Lỗi khi kết nối đến cơ sở dữ liệu MySQL: {e}')

    finally:
        # Đóng kết nối sau khi hoàn tất công việc
        if conn.is_connected():
            cursor.close()
            conn.close()
            print('Kết nối MySQL đã đóng')
    #trả về 1 danh sách chứa dữ liệu lấy được từ bảng truy vấn
    return rows

class F1RaceApp:
    #giao dien chính
    def __init__(self, root):
        self.root = root
        self.root.title("F1 Race Management")

        self.main_frame = ttk.Frame(self.root)
        self.main_frame.pack(padx=200, pady=50)
        self.style = ttk.Style()
        self.style.configure("TButton", font=("Times New Roman", 12,"bold"), foreground="blue")
        self.stats_button = ttk.Button(self.main_frame, text="Thống kê")
        self.stats_button.config(padding=(50,20))
        self.stats_button.grid(row=0, column=0, padx=10, pady=10)
        self.stats_button.config(command=self.show_stats)
    #giao diện 2 option xem bxh
    def show_stats(self):
        self.stats_window = tk.Toplevel(self.root)
        self.stats_window.title("Thống kê")

        self.stats_frame = ttk.Frame(self.stats_window)
        self.stats_frame.pack(padx=200, pady=100)

        self.driver_rank_button = ttk.Button(self.stats_frame, text="Xem BXH các tay đua")
        self.driver_rank_button.config(padding=(40,20))
        self.driver_rank_button.grid(row=0, column=0, padx=10, pady=10)
        self.driver_rank_button.config(command=self.show_driver_rank)

        self.team_rank_button = ttk.Button(self.stats_frame, text="Xem BXH các đội đua")
        self.team_rank_button.config(padding=(40,20))
        self.team_rank_button.grid(row=2, column=0, padx=10, pady=10)
        # self.team_rank_button.config(command=self.show_team_rank)

    #giao diện xem bxh tay đua
    def show_driver_rank(self):
        self.style = ttk.Style()
        self.style.configure("Treeview.Heading", font=("Times New Roman", 11, "bold"), foreground="blue")

        self.style.configure("Treeview", font=("Times New Roman",10, "italic","bold"), foreground="black")
        # Tạo cửa sổ mới cho bảng xếp hạng tay đua
        self.driver_rank_window = tk.Toplevel(self.stats_window)
        self.driver_rank_window.title("Bảng xếp hạng tay đua")
        self.driver_rank_frame = ttk.Frame(self.driver_rank_window)
        self.driver_rank_frame.pack(padx=600, pady=0)
        # Tạo Treeview để hiển thị bảng xếp hạng
        self.driver_rank_tree = ttk.Treeview(self.driver_rank_window,
                                             columns=("Tên tay đua", "Tên đội đua", "Điểm", "Thời gian"),
                                             show="headings")
        self.driver_rank_tree.heading("Tên tay đua", text="Tên tay đua")
        self.driver_rank_tree.heading("Tên đội đua", text="Tên đội đua")
        self.driver_rank_tree.heading("Điểm", text="Điểm")
        self.driver_rank_tree.heading("Thời gian", text="Thời gian")


        #connect đến db bằng lệnh sql để truy vấn các thông tin
        a = connect("select td.TenTayDua,dd.TenDoiDua,sum(kq.DiemSo) as Diem, SEC_TO_TIME(SUM(TIME_TO_SEC(kq.ThoiGianVeDich))) as ThoiGian"+"\n"
                +"from taydua as td"+"\n"
                +"inner join KetQuaThiDau as kq on kq.ID_TD = td.ID_TD"+"\n"
                +"inner join DoiDua as dd on dd.ID_DD = td.ID_DD" +"\n"
                +"group by td.TenTayDua,dd.TenDoiDua"+"\n"
                +"order by Diem desc, ThoiGian asc")

        data = []
        for i in a:
            data.append(i)

        for d in data:
            self.driver_rank_tree.insert("", "end", values=d)


        # Đặt cấu trúc bảng xếp hạng
        self.driver_rank_tree.pack(expand=True, fill="both")

        # Gắn sự kiện click vào dòng của tay đua
        self.driver_rank_tree.bind("<ButtonRelease-1>", self.show_driver_races)
    #giao diện xem chi tiết
    def show_driver_races(self, event):
        # Lấy thông tin của dòng được chọn
        selected_item = self.driver_rank_tree.focus()
        driver_info = self.driver_rank_tree.item(selected_item, "values")

        # Tạo cửa sổ mới để hiển thị thông tin chặng đua của tay đua
        driver_races_window = tk.Toplevel(self.driver_rank_window)
        driver_races_window.title("Kết quả chi tiết các chặng đua của {}".format(driver_info[0]))
        ten = driver_info[0]
        # Tạo Treeview để hiển thị thông tin các chặng đua
        driver_races_tree = ttk.Treeview(driver_races_window,columns=("Tên chặng đua", "Thứ hạng", "Điểm", "Thời gian"), show="headings")
        driver_races_tree.heading("Tên chặng đua", text="Tên chặng đua")
        driver_races_tree.heading("Thứ hạng", text="Thứ hạng")
        driver_races_tree.heading("Điểm", text="Điểm")
        driver_races_tree.heading("Thời gian", text="Thời gian")
        #kết nối đên db với đầu vào laf lệnh sql để truy vấn thông tin
        a = connect("select cd.TenChangDua,kq.ThuHang,kq.DiemSo,kq.ThoiGianVeDich"+'\n'
                    +"from KetQuaThiDau as kq" + "\n"
                    +"inner join TayDua as td on td.ID_TD = kq.ID_TD and td.TenTayDua = '"+ten+"'"+"\n"
                    +"inner join ChangDua as cd on cd.ID_CD = kq.ID_CD;")

        races_data = []
        for i in a:
            races_data.append(i)

        for race_data in races_data:
            driver_races_tree.insert("", "end", values=race_data)

        # Đặt cấu trúc bảng thông tin các chặng đua
        driver_races_tree.pack(expand=True, fill="both")

if __name__ == "__main__":
    root = tk.Tk()
    app = F1RaceApp(root)
    root.mainloop()

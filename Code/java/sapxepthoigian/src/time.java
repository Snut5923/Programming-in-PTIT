public class time implements Comparable<time>
{
    private int h, m, s;

    public time(int h, int m, int s)
    {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString()
    {
        return h + " " + m + " " + s;
    }

    @Override
    public int compareTo(time o)
    {
        if (this.h != o.h)
            return this.h - o.h;
        if (this.m != o.m)
            return this.m - o.m;
        return this.s - o.s;
    }
}
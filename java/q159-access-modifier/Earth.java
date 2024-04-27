abstract class Planet
{
    protected void revolve() {}
    abstract void rotate();
}


public class Earth extends Planet{
    protected void revolve() {}
    // public void revolve() {}
    protected void rotate() {}
}

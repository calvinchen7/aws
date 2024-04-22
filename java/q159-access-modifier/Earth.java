abstract class Planet
{
    protected void revolve() {}
    abstract void rotate();
}


public class Earth extends Planet{
    private void revolve() {}
    private void rotate() {}
}

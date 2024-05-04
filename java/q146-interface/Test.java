public class Test {

}


class Tool implements Exportable {
    public void export()
    {
        System.out.println("Tool:export");
    }
}

class ReportTool extends Tool {
    void export() {
        System.out.println("ReportTool:export");
    }

    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);   
    }

    public static void callExport(Exportable ex) {
        ex.export();
    }
}
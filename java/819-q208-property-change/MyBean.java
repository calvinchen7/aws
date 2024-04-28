import java.beans.*;

public class MyBean {
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String newValue) {
        String oldValue = this.value;
        this.value = newValue;
        this.pcs.firePropertyChange("value", oldValue, newValue);
    }

    public static void main(String[] args) {
        MyBean bean = new MyBean();
        bean.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent event)
            {
                System.out.println("Change to :" + event.getNewValue());
            }
        });
        bean.setValue("Java");
    }
}

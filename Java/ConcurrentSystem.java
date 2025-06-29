package Java;

// Order Processing Task
class OrderProcessing implements Runnable {
    private final String order;

    public OrderProcessing(String order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Processing order: " + order);
        try {
            Thread.sleep(2000); // Simulate processing time
        } catch (InterruptedException e) {
            System.out.println("Order processing interrupted");
        }
        System.out.println("Order processed: " + order);
    }
}


// Patient Management Task
class PatientManagement implements Runnable {
    private final String patientName;

    public PatientManagement(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public void run() {
        System.out.println("Managing patient: " + patientName);
        try {
            Thread.sleep(3000); // Simulate management time
        } catch (InterruptedException e) {
            System.out.println("Patient management interrupted");
        }
        System.out.println("Patient processed: " + patientName);
    }
}

// Main class to run concurrent tasks
public class ConcurrentSystem {
    public static void main(String[] args) {
        // Sample orders
        String[] orders = {"Order1", "Order2"};
        for (String order : orders) {
            Thread orderThread = new Thread(new OrderProcessing(order));
            orderThread.start();
        }

        // Sample patients
        String[] patients = {"PatientA", "PatientB"};
        for (String patient : patients) {
            Thread patientThread = new Thread(new PatientManagement(patient));
            patientThread.start();
        }
    }
}

/*
Managing patient: PatientA
Managing patient: PatientB
Processing order: Order1
Processing order: Order2
Order processed: Order1
Order processed: Order2
Patient processed: PatientB
Patient processed: PatientA
 */
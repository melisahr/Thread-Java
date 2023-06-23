public class Main {
    public static void main(String[] args){
        //thread = is a thread of execution in a program

        //Instance of MyThread
        MyThread thread2 = new MyThread();

        //set the thread to true to become a daemon thread
        thread2.setDaemon(true);
        //Check if is it's a daemon thread
            System.out.println(thread2.isDaemon());

         //Start the tread
            thread2.start();

        //Check if the thread is alive
            System.out.println(thread2.isAlive());
            //Check if the Main's thread is alive
            //System.out.println(Thread.currentThread().isAlive());

        //change the thread name
            thread2.setName("2nd thread");
            //Change the Main's thread name priority of the thread
            //Thread.currentThread().setPriority(10);

        //See the name of a specific thread
            System.out.println(thread2.getName());
            //See the Main's name of the thread
            //System.out.println(Thread.currentThread().getName());

       //Set the thread priority
             thread2.setPriority(1);
             //Set Main's thread priority, 1=Low 10=High
            //Thread.currentThread().setPriority(10);

        //Checks the priority of the Thread
            System.out.println(thread2.getPriority());
            //Checks the Main's thread priority
            //System.out.println(Thread.currentThread().getPriority());

        //How many threads are active
            System.out.println(Thread.activeCount());
    }
}
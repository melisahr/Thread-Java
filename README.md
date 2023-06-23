# Thread-Java
Overview:

Following along to a YouTube video to understand the concept of thread in Java.
What I learn to create a second thread, use a thread's method ,and making a user thread into a daemon thread.
A thread is a thread of execution in a program that goes according to priority. 
The highest being rank as a ten while to lowest is ranked as one.
While a daemon thread is a low-priority thread that run in the background to
perfoms tasks such as garbage collection. 

How?

Creating a second thread can be done in two ways.

One way is to implements a runnable, but use the second option
of making a class to a subclass of thread. The class myThread
will extends the Thread and inherit everything from it. So 
it is necessary to override the Thread's class run method. 
In the Main class, we create an object for myThread and add the 
start method to begin: nameOfThread.start(). This method will 
not only begin but will also execute the run function. 


Thread's method: 

The project also includes several thread's method. 
The codes that are commented out are the definition
of those methods or how to write this method for the Main. 
If you have one thread that creates another 
thread, it will get the priority of the thread that created it.
So set the priority for the second thread, to get its own. 


Daemon thread:

By default, the thread created by user are user threads.
In order to create a Daemon thread, use the setDaemon
thread to true. To check if the thread is Daemon, use isDaemon() 
method inside a println statement. 
Finally, check the myThread class if its a Daemon thread, use
an if/else statement and println in each. 

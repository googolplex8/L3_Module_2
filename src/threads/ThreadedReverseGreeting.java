package threads;

public class ThreadedReverseGreeting {
	int counter = 1;

	public static void main(String[] args) {
		int number = 50;
		ThreadedReverseGreeting runner = new ThreadedReverseGreeting();
		runner.createThread(number);
	}
	public void createThread(int num){
		if(counter<51){
			new Thread(()->{
				createThread(num-1);
				System.out.println("Hello from Thread " + num  + "!");
				counter++;
				
			}).start();
		}
	}
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
}

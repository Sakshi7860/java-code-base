package Threading.FileReading;

import java.io.*;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class FileReadingThread implements Runnable {
    int start;
    int end;

    PriorityQueue<Integer> queue;
    BufferedReader bf;

    BufferedWriter bufferedWriter;
    FileReadingThread(int start,int end,File file,String output) throws IOException {
        this.start=start;
        this.end=end;
        this.bf=new BufferedReader(new FileReader(file));
        queue=new PriorityQueue<>();
        this.bufferedWriter= new BufferedWriter(new FileWriter(output),10);
    }
    @Override
    public void run() {
        try {

            String str;
            while((str=this.bf.readLine())!=null)
            {
                //System.out.println(str);
                int i=Integer.parseInt(str);
                if(i>=start && i<=end)
                {
                    queue.add(i);
                }
                if(queue.size()==(end-start+1))
                    break;
            }
            //printQueue();
            writeData();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bf.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
/*    public void printQueue()
    {
        while (!queue.isEmpty())
        {
            System.out.println(Thread.currentThread().getName() +" : "+queue.poll());
        }
    }*/
    public void writeData() throws IOException {
        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            bufferedWriter.write(queue.poll().toString());
            System.out.println("/n");
        }
        bufferedWriter.close();
        System.out.println("Success");
    }
    public static void main(String[] args) throws IOException {
        File file=new File("./file.txt");
        ExecutorService service= Executors.newFixedThreadPool(3);
        service.submit(new FileReadingThread(1,5,file,"./Thread1.txt"));
        service.submit(new FileReadingThread(6,10,file,"./Thread2.txt"));
        service.submit(new FileReadingThread(11,15,file,"./Thread3.txt"));
    }
}

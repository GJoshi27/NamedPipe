/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namedpipes;

import com.lts.ipc.IPCException;
import com.lts.ipc.fifo.FIFO;
import java.io.IOException;


/**
 *
 * @author dude
 */
public class NameWriterPipe {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, IPCException {
        // TODO code application logic here
        FIFO f1 = new FIFO("pipe1");
        f1.create();
        System.out.println("Writing Message to Pipe");
        f1.openWriter();
        String buff = "Hello How are client??";
        int n = f1.write(buff.getBytes());
        System.out.println("Total number of Bytes written are " + n);

    }

}

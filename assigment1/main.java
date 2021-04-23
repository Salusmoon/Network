package Network;

import java.io.* ;
import java.net.*;

public class main {
    
    public static void main(String[] args)throws Exception
    
    {
    File file = new File("/home/salusmoon/Desktop/ws/Network/log.log");
  
    BufferedReader br = new BufferedReader(new FileReader(file));
    
    String st;
    String splitSembol = " - - ";

    while ((st = br.readLine()) != null){
        
        String[] line = st.split(splitSembol);
        //System.out.println(line[0]);
        //System.out.println(st);
        String ip = line[0];
        try {
            InetAddress addr = InetAddress.getByName(ip);
            String hostname = addr.getHostName();
            String allLine = hostname + splitSembol + line[1];
            System.out.println(allLine);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (UnknownHostException ex) {
            System.out.println("Could not find the ip address");
            System.out.println("-----------------------------------------------------------------------------------");
        }        

    }
}
}

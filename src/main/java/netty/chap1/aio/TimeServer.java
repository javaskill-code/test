package netty.chap1.aio;

import java.io.IOException;

/**
 * Created by hjy on 16-2-24.
 */
public class TimeServer {
    public static void main(String[] args) throws IOException{
        int port =8080;
        if (args!=null&&args.length>0){
            try {
                port=Integer.valueOf(args[0]);
            }catch (NumberFormatException e){
                //采用默认值
            }
        }




    }
}

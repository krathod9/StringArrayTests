import java.sql.SQLOutput;

public class BuilderVsBuffer {

    public static void builderbuffercheck()
    {
        StringBuilder stringBuilder=new StringBuilder();
        StringBuffer stringBuffer=new StringBuffer();
        long start=System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            stringBuilder.append("java");
        }
        long end=System.currentTimeMillis()-start;
        long start2=System.currentTimeMillis();
        System.out.println("Builder took "+ end);
        for(int i=0;i<10000000;i++){
            stringBuffer.append("java");
        }
        long end2=System.currentTimeMillis()-start2;
        System.out.println("Buffer took "+ end2);

    }
}

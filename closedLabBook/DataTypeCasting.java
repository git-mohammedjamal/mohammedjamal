package closedLab;

public class DataTypeCasting {

    public static void main(String[] args) {
        byte b=0,bv=50;
        short s=0,sv=11564;
        int i=0,iv=1156435;
        long l=0,lv=11564354l;
        float f=0,fv=115.6435f;
        double d=0,dv=394434.35454d;
        char c=' ',cv='e';
        
        b=(byte)s;b=(byte)i;b=(byte)l;b=(byte)f;b=(byte)d;b=(byte)c;
        bv=(byte)sv;bv=(byte)iv;bv=(byte)lv;bv=(byte)fv;bv=(byte)dv;bv=(byte)cv;
        
        s=b;
        s=(short)b;s=(short)i;s=(short)l;s=(short)f;s=(short)d;s=(short)c;
        sv=(short)bv;sv=(short)iv;sv=(short)lv;sv=(short)fv;sv=(short)dv;sv=(short)cv;

       
        i=b;i=s;
        i=c;
        i=(int)b;i=(int)s;i=(int)l;i=(int)f;i=(int)d;i=(int)c;
        iv=(int)bv;iv=(int)sv;iv=(int)lv;iv=(int)fv;iv=(int)dv;iv=(int)cv;
        
        
        l=b;l=s;l=i;
        l=c;
        l=(long)b;l=(long)s;l=(long)i;l=(long)f;l=(long)d;l=(long)c;
        lv=(long)bv;lv=(long)sv;lv=(long)iv;lv=(long)fv;lv=(long)dv;lv=(long)cv;

        f=b;f=s;f=i;f=l;
        f=c;
        f=(float)b;f=(float)s;f=(float)i;f=(float)l;f=(float)d;f=(float)c;
        fv=(float)bv;fv=(float)sv;fv=(float)iv;fv=(float)lv;fv=(float)dv;fv=(float)cv;

   
        d=b;d=s;d=i;d=l;d=f;d=c;
        d=(double)b;d=(double)s;d=(double)i;d=(double)l;d=(double)f;d=(double)c;
        dv=(float)bv;dv=(float)sv;dv=(float)iv;dv=(float)lv;dv=(float)fv;dv=(float)cv;
        c=(char)b;c=(char)s;c=(char)i;c=(char)l;c=(char)f;c=(char)c;
        cv=(char)bv;cv=(char)sv;cv=(char)iv;cv=(char)lv;cv=(char)dv;cv=(char)cv;
        }
}
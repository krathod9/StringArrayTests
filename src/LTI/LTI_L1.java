package LTI;

import javax.swing.text.DateFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LTI_L1 {

    //O:P: - Apr Sep Dec

    public static void findMonths(){
        String[] dateArray = {"11/Sep/2020", "02/Apr/2020", "31/Dec/2020"};
        ArrayList<String> months= new ArrayList<>();
        for(int i=0;i<3;i++){
            months.add(dateArray[i].split("/")[1]);
        }
        Collections.sort(months);
        System.out.println(months);
    }

}

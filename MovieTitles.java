

package movietitle;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//import java.util.Arrays;

/**
 *
 * @author Ana
 */
public class MovieTitle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        String lastSix = "";
        String example1 = "";
        String example2 = "";
        String example3 = "";
        List<String> setArray = new ArrayList<String>();
        String[] setArray1 = null;
        int rowCount = 9742;
        File file = new File("input2.txt");
        Scanner sc = new Scanner(file);
        String[] movield = new String[9742];
        String[] title = new String[9742];
        String[] genre = new String[9742];
        for (int i = 0; i < rowCount; i++) {
            String row = sc.nextLine();
            String[] data = row.split(",");
            movield[i] = data[0];
            title[i] = data[1];
            genre[i] = data[2];
            String titleL = title[i];
            //System.out.println(data);
            String titleFirst = "";
            for (int j = 0; j < titleL.length(); j++) {
                if (titleL == null) {
                    titleFirst = "";
                } else if (titleL.length() <= 6) {
                    titleFirst = titleL;
                } else {

                    titleFirst = titleL.substring(0, titleL.length() - 6);

                }

            }
            
            setArray = Arrays.asList(titleFirst);
            for (int h = 0; h < setArray.size(); h++) {
                System.out.println("example = " + setArray.get(h));

            }

        }

    }
}

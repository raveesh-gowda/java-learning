package imports;

import java.math.BigDecimal;
import java.util.ArrayList;

import static java.lang.System.out;
import static java.util.Collections.sort;

public class ImportsRunner {

    public static void main(String[] args) {
        //String is inside the package java.lang(default import)
        String str = "";
        BigDecimal db = null;

        System.out.println(str + "Imports");
        out.println(str + "Static Imports");

        sort(new ArrayList<String>());
    }

}

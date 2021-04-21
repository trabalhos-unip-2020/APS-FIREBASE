package com.mycompany.firebase;

import com.mycompany.firebase.menu.Menu;
import static com.mycompany.firebase.util.Common.initFirebase;

/**
 *
 * @author Diogo Enrico Marianna
 */
public class Main {
    public static void main(String[] args){
        initFirebase();
        new Menu().setVisible(true);
        
    }
}

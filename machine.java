package Nodes;

import java.util.ArrayList;

public class machine {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();



        java.lang.String input = "BAABBAAABAA";



        Node s0 = new Node("s2", "s1", "s0");
        Node s1 = new Node("s1", "s2", "s1");
        Node s2 = new Node("", "s3", "s2");
        Node s3 = new Node("s3", "s0", "s3");


        java.lang.String destination = "s0";
        list.add(destination);
        for (int i = 0; i < input.length(); i++) {
            char direction = input.charAt(i);

            if (direction == 'B') {
                if (s0.nodeName == destination) {
                    destination = s0.direction2;
                }
                else if (s1.nodeName == destination) {
                    destination = s1.direction2;
                }
                else if (s2.nodeName == destination) {
                    destination = s2.direction2;
                }
                else if (s3.nodeName == destination) {
                    destination = s3.direction2;
                }
                if (destination == ""){
                    System.out.println("geen verbinding gevonden bij" + i + "e input");
                    break;
                }
                list.add(destination);
            }
            if (direction == 'A') {
              //  System.out.println(s0.direction1);
                if (s0.nodeName == destination) {
                    destination = s0.direction1;
                }
                else if (s1.nodeName == destination) {
                    destination = s1.direction1;
                }
                else if (s2.nodeName == destination) {
                    destination = s2.direction1;
                }
                else if (s3.nodeName == destination) {
                    destination = s3.direction1;
                }
                if (destination == ""){
                    System.out.println("geen verbinding gevonden bij " + i + "e input");
                    break;
                }
                list.add(destination);
            }
        }
        System.out.println("gevolgde pad: ");
        System.out.println(list);
    }
}







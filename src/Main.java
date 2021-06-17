import java.util.Scanner;  // Import the Scanner class


/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Budi Pradnyana
 */
public class Main {
    public static void main(String[] args) {
        Node node1 = new Node("1:Kebayoran Lama",0);
        Node node2 = new Node("2:Kebayoran Center",0.5);
        Node node3 = new Node("3:Agen Ban",5);
        Node node4 = new Node("4:Radio Dalam",2);
        Node node5 = new Node("5:Agen Bintaro Permai",4.5);
        Node node6 = new Node("6:Kesehatan",4);
        Node node7 = new Node("7:Fiyora",5);
        Node node8 = new Node("8:Agen MRT Lebak Bulus",6);
        Node node9 = new Node("9:Lebak Bulus Agent",7);
        Node node10 = new Node("10:Refin",8);
        Node node11 = new Node("11:Juang Amirain",10);
        Node node12 = new Node("12:Agen Ripqi Hidayat",10.5);
        Node node13 = new Node("13:Kemang Selatan",11);
        Node node14 = new Node("14:Jl Margasatwa",11.5);
        Node node15 = new Node("15:TB Simatupang",12);
        Node node16 = new Node("16:Kantor Perwakilan Mampang",12.5);
        Node node17 = new Node("17:Berkah Jaya",13);
        Node node18 = new Node("18:Kantor Perwakilan Pasar Minggu",13.5);
        Node node19 = new Node("19:Agen Pacorant Tebet",14);
        Node node20 = new Node("20:Agen Asembaris",14.5);
        
        
        
    Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("1: Kebayoran Lama");
        System.out.println("2: Kebayoran Center");
        System.out.println("3: Agen Ban");
        System.out.println("4: Radio Dalam");
        System.out.println("5: Agen Bintaro Permai");
        System.out.println("6: Kesehatan");
        System.out.println("7: Fiyora");
        System.out.println("8: Agen MRT Lebak Bulus");
        System.out.println("9: Lebak Bulus Agent");
        System.out.println("10: Refin");
        System.out.println("11: Juang Amirain");
        System.out.println("12: Agen Ripqi Hidayat");
        System.out.println("13: Kemang Selatan");
        System.out.println("14: Jl Margasatwa");
        System.out.println("15: TB Simatupang");
        System.out.println("16: Kantor Perwakilan Mampang");
        System.out.println("17: Berkah Jaya");
        System.out.println("18: Kantor Perwakilan Pasar Minggu");
        System.out.println("19: Agen Pacorant Tebet");
        System.out.println("20: Agen Asembaris");
        System.out.println(" ");
        System.out.println("Pilih Tempat Awal Anda dengan mengetik nomor yang sesuai");
    
int month = sc.nextInt();
        Node start = null;
        switch (month) {
            case 1:  start = node1;
                     break;
            case 2:  start = node2;
                     break;
            case 3:  start = node3;
                     break;
            case 4:  start = node4;
                     break;
            case 5:  start = node5;
                     break;
            case 6:  start = node6;
                     break;
            case 7:  start = node7;
                     break;
            case 8:  start = node8;
                     break;
            case 9:  start = node9;
                     break;
            case 10: start = node10;
                     break;
            case 11: start = node11;
                     break;
            case 12: start = node12;
                     break;
            case 13:  start = node13;
                     break;
            case 14:  start = node14;
                     break;
            case 15:  start = node15;
                     break;
            case 16:  start = node16;
                     break;
            case 17:  start = node17;
                     break;
            case 18:  start = node18;
                     break;
            case 19:  start = node19;
                     break;
            case 20:  start = node20;
                     break;
            default: start = node1;
                     break;
        }
  

        System.out.println(" ");
        System.out.println("Pilih Tujuan Anda dengan mengetik nomor yang sesuai");
        
        
        
int months = sc.nextInt();
        Node end = null;
        switch (months) {
            case 1:  end = node1;
                     break;
            case 2:  end = node2;
                     break;
            case 3:  end = node3;
                     break;
            case 4:  end = node4;
                     break;
            case 5:  end = node5;
                     break;
            case 6:  end = node6;
                     break;
            case 7:  end = node7;
                     break;
            case 8:  end = node8;
                     break;
            case 9:  end = node9;
                     break;
            case 10: end = node10;
                     break;
            case 11: end = node11;
                     break;
            case 12: end = node12;
                     break;
            case 13:  end = node13;
                     break;
            case 14:  end = node14;
                     break;
            case 15:  end = node15;
                     break;
            case 16:  end = node16;
                     break;
            case 17:  end = node17;
                     break;
            case 18:  end = node18;
                     break;
            case 19:  end = node19;
                     break;
            case 20:  end = node20;
                     break;
            default: end = node1;
                     break;
        }

  

        
        node1.connect(new Edge(node2, 1.3));
        
        node2.connect(new Edge(node3, 2.9));
        node2.connect(new Edge(node5, 6));
        
        node3.connect(new Edge(node19, 6.8));
        node3.connect(new Edge(node4, 1.4));
        
        node4.connect(new Edge(node16, 6.1));
        node4.connect(new Edge(node10, 4.6));
        node4.connect(new Edge(node11, 4.7));        
        
        node5.connect(new Edge(node6, 3));
        
        node6.connect(new Edge(node7, 1));
        
        node7.connect(new Edge(node8, 4.6));
        
        node8.connect(new Edge(node10, 3));
        node8.connect(new Edge(node9, 2.5));
        
        node9.connect(new Edge(node11, 3.3));
        
        node10.connect(new Edge(node11, 1.2));
        
        node11.connect(new Edge(node12, 3.2));
        node11.connect(new Edge(node13, 4.1));
        
        node12.connect(new Edge(node14, 4.5));
        node12.connect(new Edge(node15, 4.9));
        
        node13.connect(new Edge(node14, 2.6));
        node13.connect(new Edge(node18, 3.8));
        
        node14.connect(new Edge(node15, 3.1));
        
        
        node15.connect(new Edge(node18, 2.8));
        
        node16.connect(new Edge(node19, 5));
        node16.connect(new Edge(node17, 2.4));
        
        node17.connect(new Edge(node18, 3.1));
        node17.connect(new Edge(node20, 3.9));
        
        node19.connect(new Edge(node20, 3.6));
        

        
        AStarSearch astar = new AStarSearch();
        astar.Astarsearch(start, end);
        System.out.println();
        System.out.print("Rute Tercepat Untuk sampai tujuan : ");
        astar.printRute(end);
        System.out.println();
        System.out.println("Jarak Yang Perlu Ditempuh : "+astar.getCosttotal() + " Km");
    }
}

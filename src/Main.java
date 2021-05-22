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
        Node node1 = new Node("a:Kebayoran Lama",0);
        Node node2 = new Node("b:Kebayoran Center",0.5);
        Node node3 = new Node("c:Agen Ban",5);
        Node node4 = new Node("d:Radio Dalam",2);
        Node node5 = new Node("e:Agen Bintaro Permai",4.5);
        Node node6 = new Node("f:Kesehatan",4);
        Node node7 = new Node("g:Fiyora",5);
        Node node8 = new Node("h:Agen MRT Lebak Bulus",6);
        Node node9 = new Node("i:Lebak Bulus Agent",7);
        Node node10 = new Node("j:Refin",8);
        Node node11 = new Node("k:Juang Amirain",10);
        Node node12 = new Node("l:Agen Ripqi Hidayat",10.5);
        Node node13 = new Node("m:Kemang Selatan",11);
        Node node14 = new Node("n:Jl Margasatwa",11.5);
        Node node15 = new Node("o:TB Simatupang",12);
        Node node16 = new Node("p:Kantor Perwakilan Mampang",12.5);
        Node node17 = new Node("q:Berkah Jaya",13);
        Node node18 = new Node("r:Kantor Perwakilan Pasar Minggu",13.5);
        Node node19 = new Node("s:Agen Pacorant Tebet",14);
        Node node20 = new Node("t:Agen Asembaris",14.5);
        
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
        node9.connect(new Edge(node12, 5.3));
        
        node10.connect(new Edge(node11, 1.2));
        
        node11.connect(new Edge(node12, 3.2));
        node11.connect(new Edge(node13, 4.1));
        
        node12.connect(new Edge(node14, 4.5));
        node12.connect(new Edge(node15, 4.9));
        
        node13.connect(new Edge(node14, 2.6));
        node13.connect(new Edge(node18, 3.8));
        
        node14.connect(new Edge(node15, 3.1));
        
        node15.connect(new Edge(node15, 2.8));
        
        node16.connect(new Edge(node19, 5));
        node16.connect(new Edge(node17, 2.4));
        
        node17.connect(new Edge(node18, 3.1));
        node17.connect(new Edge(node20, 3.9));
        
        node19.connect(new Edge(node20, 3.6));
        
        
        
        AStarSearch astar = new AStarSearch();
        astar.Astarsearch(node1, node16);
        System.out.println();
        System.out.print("Rutenya : ");
        astar.printRute(node16);
        System.out.println();
        System.out.println("Costnya : "+astar.getCosttotal());
    }
}

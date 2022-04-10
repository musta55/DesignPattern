package Adapter;

public class School {
    public static void main(String[] args) {
      //  PilotPen pp=new PilotPen();
        Pen p=new PenAdapter();
    AssignmentWork asw=new AssignmentWork();
    asw.setP(p);
    asw.writeAssignment("I am bit tired to write an assignment");


    }
}

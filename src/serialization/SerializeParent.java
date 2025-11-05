package serialization;

import java.io.Serializable;

public class SerializeParent extends SerializeGrandParent implements Serializable {
    private static int empIdGenerate = 1;
    private final static long serialVersionUID = 1L;
    private String name;
    private int empId;
    public SerializeParent(String name){
        this.empId = empIdGenerate++;
        this.name = name;
        System.out.println("SerializeParent constructor called...");
    }

    public int getEmpId() {
        return empId;
    }
    public String getName(){
        return this.name;
    }
}


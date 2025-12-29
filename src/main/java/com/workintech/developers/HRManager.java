package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HRManager manages human resources");
    }

    public void addEmployee(JuniorDeveloper dev){
        for(int i=0;i<juniorDevelopers.length;i++){
            if(juniorDevelopers[i]==null){
                juniorDevelopers[i]=dev;
                return;
            }
        }
        System.out.println("JuniorDeveloper array is full!");
    }

    public void addEmployee(MidDeveloper dev){
        for(int i=0;i<midDevelopers.length;i++){
            if(midDevelopers[i]==null){
                midDevelopers[i]=dev;
                return;
            }
        }
        System.out.println("MidDeveloper array is full!");
    }

    public void addEmployee(SeniorDeveloper dev){
        for(int i=0;i<seniorDevelopers.length;i++){
            if(seniorDevelopers[i]==null){
                seniorDevelopers[i]=dev;
                return;
            }
        }
        System.out.println("SeniorDeveloper array is full!");
    }
}

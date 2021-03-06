/*
Matt Strand
2/19/2018
Process Class for PCB project
 */
package pcb;

public class Process {
    private int idNum;
    private int CPUterm;
    private int IOrequest;
    private int waitingTerm;
    private int memoryUsage;
    private int processType;
    private int priority;
    
    public Process(){
        this.idNum = 0;
        this.CPUterm = 0;
        this.IOrequest = 0;
        this.waitingTerm = 0;
        this.memoryUsage = 0;
        this.processType = 0;
        this.priority = 0;
    }
    
    public Process(int id, int cpu, int io, int wait, int mem, int processType, int priority){
        this.idNum = id;
        this.CPUterm = cpu;
        this.IOrequest = io;
        this.waitingTerm = wait;
        this.memoryUsage = mem;
        this.processType = processType;
        this.priority = priority;
    }
    //SETTERS
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public void setCPUterm(int CPUterm) {
        this.CPUterm = CPUterm;
    }

    public void setIOrequest(int IOrequest) {
        this.IOrequest = IOrequest;
    }

    public void setWaitingTerm(int waitingTerm) {
        this.waitingTerm = waitingTerm;
    }

    public void setMemoryUsage(int memoryUsage) {
        this.memoryUsage = memoryUsage;
    }
    
    public void setProcessType(int processType){
        this.processType = processType;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }
    //GETTERS
    public int getIdNum() {
        return idNum;
    }

    public int getCPUterm() {
        return CPUterm;
    }

    public int getIOrequest() {
        return IOrequest;
    }

    public int getWaitingTerm() {
        return waitingTerm;
    }

    public int getMemoryUsage() {
        return memoryUsage;
    }
    
    public int getProcessType(){
        return processType;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public String processString(){
        String str =  idNum +"," + memoryUsage + "," + processType;
        return str;
    }
}

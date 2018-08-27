





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AAKRITI
 */
public class employee {
    public int empid;
    public String empcat;
    public String empmin;
    public String empdep;
    public String empsub;
    public String dom;
    public String empcoor;
    public String cemail;
    public String aemail;
   
     public void setId(int id)
    {
        this.empid=id;
        
     }
     
     public void setCat(String cat)
    {
       this.empcat=cat;
        
     }
     public void setMin(String min)
    {
        this.empmin=min;
        
     }
     public void setDep(String dep)
    {
        this.empdep=dep;
        
     }
     public void setDom(String domain)
    {
        this.dom=domain;
        
     }
     public void setCoor(String coor)
    {
        this.empcoor=coor;
        
        
     }
     public void setCmail(String cmail)
    {
        this.cemail=cmail;
        
     }
      public void setAmail(String amail)
    {
        this.aemail=amail;
        
     }
    
    public int getId()
    {
        
        return this.empid;
     }
     
     public String getCat()
    {
       
        return this.empcat;
     }
     public String getMin()
    {
         return this.empmin;
     }
     public String getDep()
    {
        
        return this.empdep;
     }
     public String getDom()
    {
        
        return this.dom;
     }
     public String getCoor()
    {
        
        return this.empcoor;
        
        
     }
     public String getCmail()
    {
       
        return this.cemail;
     }
      public String getAmail()
    {
        
        return this.aemail;
     }
    
    
    
}

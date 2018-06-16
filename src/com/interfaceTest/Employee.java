package com.interfaceTest;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	 
    int employeeId;
    String employeeName;
 
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        employeeId = in.readInt();
        employeeName = (String) in.readObject();
 
    }
 
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
 
        out.writeInt(employeeId);
        out.writeObject(employeeName);
    }
}
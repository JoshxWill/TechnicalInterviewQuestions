package Abstraction;

import Abstraction.Abstraction;

public class UserTableManager extends Abstraction<UserData> {

    @Override
    public String getTableName() {return "USERTABLE";}
}

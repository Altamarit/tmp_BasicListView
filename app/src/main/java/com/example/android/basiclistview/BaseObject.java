package com.example.android.basiclistview;

/**
 * Created by Alex on 01/03/2017.
 */

public class BaseObject {
    // constructor for and the base object
    // TODO refactor to the name used in the app being developed
    // TODO use the param list as needed in the app ... this example uses 3 strings...
    public BaseObject(String param1, String param2, String param3) {
        mParam1 = param1;
        mParam2 = param2;
        mParam3 = param3;
    }

    // TODO use the fields required for the app being developed
    private String mParam1;
    private String mParam2;
    private String mParam3;


    // return Param1
    public String getParam1() {
        return mParam1;
    }
    // return Param2
    public String getParam2() {
        return mParam2;
    }
    // return Param3
    public String getParam3() {
        return mParam3;
    }


} // END class definition

//ofbizDemoTypes = delegator.findList("OfbizDemoType", null, null, null, null, false);
//context.ofbizDemoTypes = ofbizDemoTypes;
//ofbizDemoList = delegator.findList("OfbizDemo", null, null, null, null, false);
//context.ofbizDemoList = ofbizDemoList;

// New way of doing the above in Groovy - Use DSL Capabilities
context.ofbizDemoTypes = from("OfbizDemoType").queryList()

ofbizDemoList = from("OfbizDemo").queryList()
logInfo("The value of ofbizDemoList is ====== " + ofbizDemoList)
context.ofbizDemoList = ofbizDemoList;

// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
dateAsString = sdf.format(date)
node2 = node.createChild()
node2.text = dateAsString + " Ccl * "
node2.icons.add("kaddressbook")
node2["actualDate"] = date
c.edit(node2)

// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
dateAsString = sdf.format(date)
node.text = dateAsString + " Ccl * " + node.text
node.icons.remove("kaddressbook")
node.icons.add("kaddressbook")
node["actualDate"] = date
c.edit(node)

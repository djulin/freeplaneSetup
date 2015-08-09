// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
dateAsString = sdf.format(date)
node.text = dateAsString + " Email * " + node.text
node.icons.remove("kmail")
node.icons.add("kmail")
node["actualDate"] = date
c.edit(node)

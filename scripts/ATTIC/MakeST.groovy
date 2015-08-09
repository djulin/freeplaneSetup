// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
dateAsString = sdf.format(date)
node.text = dateAsString + " ST * " + node.text
node.icons.remove("clock")
node.icons.add("clock")
node["actualDate"] = date
c.edit(node)

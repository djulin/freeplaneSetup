// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
dateAsString = sdf.format(date)
node.text = dateAsString + " Event * " + node.text
node.icons.remove("bell")
node.icons.add("bell")
node["actualDate"] = date
c.edit(node)

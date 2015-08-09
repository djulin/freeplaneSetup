// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
dateAsString = sdf.format(date)
node.text = dateAsString + " Action * " + node.text
node.icons.remove("launch")
node.icons.add("launch")
node["actualDate"] = date
c.edit(node)

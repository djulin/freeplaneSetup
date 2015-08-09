// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
dateAsString = sdf.format(date)
node.text = dateAsString + " Mtg * " + node.text
node.icons.remove("group")
node.icons.add("group")
node["actualDate"] = date
c.edit(node)

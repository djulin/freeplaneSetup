// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
dateAsString = sdf.format(date)
node.text = dateAsString + " FYI * " + node.text
node.icons.remove("info")
node.icons.add("info")
node["actualDate"] = date
c.edit(node)

// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
yesterday = date - 1
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
yesterdayAsString = sdf.format(yesterday)
node.text = node.text + yesterdayAsString
node["rollup.end"] = yesterday
//sdft = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm")
//node["my.last"] = sdft.format(node.lastModifiedAt)
//node["my.created"] = sdft.format(node.createdAt)

# OpenSearch Query 


## To list all the index
Request will be `GET /_cat/indices?v`

## Query with AND and OR condition

To fetch data with below condition requirement, 
    * Condition 1
    * AND ( Condition 2 OR Condition 3)
Request would be
```
GET <index name>/_search
{
  "query": {
    "bool": {
      "filter": [
        {
          "match": {
            "<condition 1 - field name>": "<condition 1 - field value>"
          }
        }
      ],
      "must": [
        {
          "bool": {
            "should": [
              {
                "match": {
                  "<condition 2 - field name>": "<condition 2 - field value>"
                }
              },
              {
                "match": {
                  "<condition 3 - field name>": "<condition 3 - field value>"
                }
              }
            ]
          }
        }
      ]
    }
  }
}
```
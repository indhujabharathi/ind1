$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:datatable/cl.feature");
formatter.feature({
  "name": "Eating fruits",
  "description": "this explains about the fruits",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Eating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \"\u003cstart\u003e\" fruits",
  "keyword": "Given ",
  "rows": [
    {
      "cells": [
        "type",
        "with"
      ]
    },
    {
      "cells": [
        "apple",
        "me"
      ]
    },
    {
      "cells": [
        "orange",
        "john"
      ]
    }
  ]
});
formatter.step({
  "name": "i eat \"\u003ceat\u003e\" fruits",
  "keyword": "When "
});
formatter.step({
  "name": "i have \"\u003cleft\u003e\" fruits",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "start",
        "eat",
        "left"
      ]
    },
    {
      "cells": [
        "12",
        "3",
        "4"
      ]
    },
    {
      "cells": [
        "1",
        "4",
        "6"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Eating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \"12\" fruits",
  "rows": [
    {
      "cells": [
        "type",
        "with"
      ]
    },
    {
      "cells": [
        "apple",
        "me"
      ]
    },
    {
      "cells": [
        "orange",
        "john"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "cl1.aa(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i eat \"3\" fruits",
  "keyword": "When "
});
formatter.match({
  "location": "cl1.bb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i have \"4\" fruits",
  "keyword": "Then "
});
formatter.match({
  "location": "cl1.c(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Eating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \"1\" fruits",
  "rows": [
    {
      "cells": [
        "type",
        "with"
      ]
    },
    {
      "cells": [
        "apple",
        "me"
      ]
    },
    {
      "cells": [
        "orange",
        "john"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "cl1.aa(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i eat \"4\" fruits",
  "keyword": "When "
});
formatter.match({
  "location": "cl1.bb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i have \"6\" fruits",
  "keyword": "Then "
});
formatter.match({
  "location": "cl1.c(String)"
});
formatter.result({
  "status": "passed"
});
});
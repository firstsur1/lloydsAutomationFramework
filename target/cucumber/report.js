$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/functionalTests/BuyMacBookPro.feature");
formatter.feature({
  "line": 1,
  "name": "Buying a MacBook Pro on the website",
  "description": "\r\nAs an online customer\r\nI want to choose a MacBook with accessories on the website\r\nSo that I can buy it online",
  "id": "buying-a-macbook-pro-on-the-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5125225524,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "A MacBook 15” with accessories can be ordered on the website",
  "description": "",
  "id": "buying-a-macbook-pro-on-the-website;a-macbook-15”-with-accessories-can-be-ordered-on-the-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I go to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I choose a MacBook Pro with the following features and accessories",
  "rows": [
    {
      "cells": [
        "Option",
        "Specification"
      ],
      "line": 10
    },
    {
      "cells": [
        "Screen",
        "15-inch"
      ],
      "line": 11
    },
    {
      "cells": [
        "Processor",
        "2.9GHz"
      ],
      "line": 12
    },
    {
      "cells": [
        "Colour",
        "Silver"
      ],
      "line": 13
    },
    {
      "cells": [
        "Software",
        "Logic Pro X"
      ],
      "line": 14
    },
    {
      "cells": [
        "Display adapter",
        "USB-C to USB Adapter"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I can place an order for it",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.goToWebsite()"
});
formatter.result({
  "duration": 2604815836,
  "status": "passed"
});
formatter.match({
  "location": "MacBookProPageSteps.chooseMacBookProWithSelectedFeaturesAndAccessories(DataTable)"
});
formatter.result({
  "duration": 19386575109,
  "status": "passed"
});
formatter.match({
  "location": "MacBookProPageSteps.placeOrder()"
});
formatter.result({
  "duration": 3788762693,
  "status": "passed"
});
formatter.after({
  "duration": 3072084117,
  "status": "passed"
});
formatter.before({
  "duration": 3771063386,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "The correct price and VAT are displayed for a MacBook 15” with accessories",
  "description": "",
  "id": "buying-a-macbook-pro-on-the-website;the-correct-price-and-vat-are-displayed-for-a-macbook-15”-with-accessories",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "when I choose the following items:",
  "rows": [
    {
      "cells": [
        "Option",
        "Price in £"
      ],
      "line": 20
    },
    {
      "cells": [
        "MacBook Pro",
        "2699.00"
      ],
      "line": 21
    },
    {
      "cells": [
        "Logic Pro X",
        "199.99"
      ],
      "line": 22
    },
    {
      "cells": [
        "Display adapter",
        "19.00"
      ],
      "line": 23
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I proceed to the checkout",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "a total price of £2917.99 will be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "£486.34 will be listed for VAT.",
  "keyword": "And "
});
formatter.match({
  "location": "MacBookProPageSteps.when_I_choose_the_following_items(DataTable)"
});
formatter.result({
  "duration": 34507603995,
  "status": "passed"
});
formatter.match({
  "location": "MacBookProPageSteps.I_proceed_to_the_checkout()"
});
formatter.result({
  "duration": 3223763223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2917",
      "offset": 18
    },
    {
      "val": "99",
      "offset": 23
    }
  ],
  "location": "MacBookProPageSteps.a_total_price_of_£_will_be_displayed(int,int)"
});
formatter.result({
  "duration": 100224969,
  "error_message": "java.lang.AssertionError: expected [2917.99] but found [£2,718.00]\r\n\tat org.testng.Assert.fail(Assert.java:93)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:134)\r\n\tat org.testng.Assert.assertEquals(Assert.java:115)\r\n\tat org.testng.Assert.assertEquals(Assert.java:189)\r\n\tat org.testng.Assert.assertEquals(Assert.java:199)\r\n\tat pageObjects.MacBookProPage.totalPriceDisplayed(MacBookProPage.java:234)\r\n\tat stepDefinitions.MacBookProPageSteps.a_total_price_of_£_will_be_displayed(MacBookProPageSteps.java:109)\r\n\tat ✽.Then a total price of £2917.99 will be displayed(src/test/resources/functionalTests/BuyMacBookPro.feature:25)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "486",
      "offset": 1
    },
    {
      "val": "34",
      "offset": 5
    }
  ],
  "location": "MacBookProPageSteps.£_will_be_listed_for_VAT(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2838980402,
  "status": "passed"
});
});
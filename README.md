[![Build Status](https://travis-ci.org/TheFreakLord/ItemBuilder.svg?branch=master)](https://travis-ci.org/TheFreakLord/ItemBuilder)
[![Download](https://api.bintray.com/packages/thefreaklord/maven/ItemBuilder/images/download.svg)](https://bintray.com/thefreaklord/maven/ItemBuilder/_latestVersion)

# ItemBuilder

---

## About
A simple set of classes which let you build items using the "new" lambdas.

---

## Usage

```Java
ItemStack itemStack = ItemBuilder.buildItem(item -> {
  item.setMaterial(Material.STONE);
  item.setAmount(5);
  item.setDisplayName("The Magic Stone");
  item.setLore("Listen!", "This stone is magical!");
});
```

---

## How to contribute

Just open up a pull request if you think this project needs anything. ^^

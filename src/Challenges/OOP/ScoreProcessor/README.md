# CSC7081---Programming
## Challenge

> OOP, Testing & JCF

# Reading a CSV - Countries of the world

This challenge is based on reading data on countries from a csv file. You'll need to read and map some of data (mapping exercise) and calculate an additional field (density) based on some of the data being read.

1. Create a StarterApp with a main method.

2. Analyse and create a class Country.java to store the data in this file countries.csv. Download countries.csv. Include a field for density (double).

3. Read and store the data in an appropriate container - eg List but include the following mappings for each country.

```
// REGION : EASTERN EUROPE and WESTERN EUROPE should be recorded as Europe 
// SUB-SAHARAN AFRICA & NORTHERN AFRICA should be recorded as Africa       
// also all should be Upper case first letter only

// Calculate and store for each county the population density - based on population / area 

```

4. Output to screen the data - example output ..

```
Name                           :Afghanistan
Region                         :Asia
population                     :31056997
area                           :647500
density                        :47.96

Name                           :Albania
Region                         :Europe
population                     :3581655
area                           :28748
density                        :124.59

Name                           :Algeria
Region                         :Africa
population                     :32930091
area                           :2381740
density                        :13.83
```

5. Show to screen all countries by region - create a method that enable a search by region.

Regional data - Europe
Europe Albania
Europe Andorra
Europe Armenia
Europe Austria

6. Show countries sorted on population ascending. Hint you'll need a Comparator for this.

```
Countries by population ascending
7026         St Pierre & Miquelon
7502         Saint Helena
9439         Montserrat
11810         Tuvalu
13287         Nauru
13477         Anguilla
```
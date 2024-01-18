# backend-task
## 1. Top-n email domains
        Write a Java program that takes standard input, where each line contains an email address eg.

        joeblogs@saldoaaps.com
        andrew.smith@gmail.com ...
    
        and outputs the 10 domains (or less if there aren't that many) that appear the most often with a
        count of the number of times it appears after each domain. eg.
    
        saldoaaps.com 2553
        yahoo.com 1315 ...
    
        and up to 8 more lines.
        Please treat this exercise as you would with production code.
        Explain why your solution is optimal.
## Solution:
- Please find the solution in the TopDomainsCounter.java file.
- A simple implementation using a HashMap to store domain occurrences:
- The program has a time complexity of O(NlogN), where N is the number of email addresses. This is due to the sorting step when displaying the top domains.
- This program is optimal when we store multiple records and read them only once.
- In cases when we need to read stored values many times it would be better to use a TreeMap instead of HashMap.

## 2. Auto parts compatibility

    SaldoApps R&D department wants to see if users can order and assemble automobiles that
    they can control using our platform. The first step is to set up a catalog of the automobile parts
    and a compatibility mapping. Each automobile part has a name, serial number, manufacturer,
    weight, and a list of other parts it is compatible with within the system. How would you model a
    data storage of the compatibility of parts? Please write a small document or sketch explaining
    your idea. - How is your solution impacted if the number of parts in the catalog reaches tens of
    millions? - How does the solution change if new parts are added and old parts removed from the
    catalog at high frequency? Be prepared to discuss your solution.
    
## Solution:
I would use some graph based databases like Neo4j.
- Easy to store complex many-to-many relationships.
- Graph databases can scale horizontally to handle large datasets and complex relationship structures. 
- Graph databases are optimized for handling complex queries involving multiple levels of relationships, recursive patterns, and graph algorithms. This can be challenging to achieve efficiently in traditional relational databases.

# Single Lane Bridge
Demonstrates the use of multithreading to guide multiple cars of right and left side cross a single lane bridge.
The skeleton code was taken from [Imperial College London](https://www.doc.ic.ac.uk/~jnm/book/book_applets/SingleLaneBridge.html).Every car is a thread. Red cars arrive on the right side of the bridge,the blue on the left. The frequency of arrival of cars, as well as the total number of cars cars arriving on each side are parameters of the simulation.The bridge is the shared memory area that we need to manage. The time which is required to pass a car, and how many cars on the same side they can pass each time are also parameters of the simulation.

*Disclaimer: Times may differ but outcomes will be similar.  

## Methods
1. Unsafe Bridge(Bridge)
2. Safe Bridge
3. Fair Bridge
4. Adjusted Fair Bridge

## Usage & Examples
*After compiling in class files.   

```
java SingleLaneBridge [max Red cars] [maxBluecars] [Method] [arrival frequency milliseconds] [transit time in milliseconds] [#same cars in Bridge]
```

#### Unsafe Bridge
Write in cmd or powershell :  

```
java SingleLaneBridge 2 3 Bridge 30 100 1
```

##### Outcome:

```
Red Car 0 Arrived at 2019-03-15T16:29:23.851Z
Red Car 0 Passing at 2019-03-15T16:29:23.913Z
                                                                                     Blue Car 0 Arrived at 2019-03-15T16:29:23.913Z
                                                                                     Blue Car 0 Passing at 2019-03-15T16:29:23.913Z
Crash
Red Car 1 Arrived at 2019-03-15T16:29:23.944Z
                                                                                     Blue Car 1 Arrived at 2019-03-15T16:29:23.944Z
Red Car 1 Passing at 2019-03-15T16:29:23.944Z
Crash
                                                                                     Blue Car 1 Passing at 2019-03-15T16:29:23.944Z
Crash
                                                                                     Blue Car 2 Arrived at 2019-03-15T16:29:23.976Z
                                                                                     Blue Car 2 Passing at 2019-03-15T16:29:23.976Z
Crash
Blue Car 0 Passed at 2019-03-15T16:29:24.023Z
                                                                                     Red Car 0 Passed at 2019-03-15T16:29:24.023Z
Blue Car 1 Passed at 2019-03-15T16:29:24.054Z
                                                                                     Red Car 1 Passed at 2019-03-15T16:29:24.054Z
Blue Car 2 Passed at 2019-03-15T16:29:24.086Z
```

##### Conclusion:
As you can see the first crash is between car A 

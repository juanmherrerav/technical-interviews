[Matrix | HackerRank](https://www.hackerrank.com/challenges/matrix/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=graphs)

> The kingdom of Zion has cities connected by bidirectional roads. There is a unique path between any pair of cities. Morpheus has found out that the machines are planning to destroy the whole kingdom. If two machines can join forces, they will attack. Neo has to destroy roads connecting cities with machines in order to stop them from joining forces. There must not be any path connecting two machines.
> 
> Each of the roads takes an amount of time to destroy, and only one can be worked on at a time. Given a list of edges and times, determine the minimum time to stop the attack.
> 
> For example, there are
> 
> cities called . Three of them have machines and are colored red. The time to destroy is shown next to each road. If we cut the two green roads, there are no paths between any two machines. The time required is
> 
> .
> 
> ![image](https://s3.amazonaws.com/hr-assets/0/1528209077-f7699103c6-matrixExample.png)
> 
> **Function Description**
> 
> Complete the function _minTime_ in the editor below. It must return an integer representing the minimum time to cut off access between the machines.
> 
> minTime has the following parameter(s):
> 
> -   _roads_: a two-dimensional array of integers, each
> 
> where cities are connected by a road that takes
> 
> -   to destroy
> -   _machines_: an array of integers representing cities with machines
> 
> **Input Format**
> 
> .MathJax\_SVG\_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax\_SVG .MJX-monospace {font-family: monospace} .MathJax\_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax\_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax\_SVG \* {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue} .MathJax\_SVG\_LineBox {display: table!important} .MathJax\_SVG\_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
> 
> The first line of the input contains two space-separated integers,
> 
> and
> 
> , the number of cities and the number of machines.
> 
> Each of the following
> 
> lines contains three space-separated integers, , and . There is a bidirectional road connecting and , and to destroy this road it takes
> 
> units.
> 
> Each of the last
> 
> lines contains an integer,
> 
> , the label of a city with a machine.
> 
> **Constraints**
> 
> .MathJax\_SVG\_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax\_SVG .MJX-monospace {font-family: monospace} .MathJax\_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax\_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax\_SVG \* {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue} .MathJax\_SVG\_LineBox {display: table!important} .MathJax\_SVG\_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
> 
> **Output Format**
> 
> .MathJax\_SVG\_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax\_SVG .MJX-monospace {font-family: monospace} .MathJax\_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax\_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax\_SVG \* {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue} .MathJax\_SVG\_LineBox {display: table!important} .MathJax\_SVG\_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
> 
> Return an integer representing the minimum time required to disrupt the connections among all machines.
> 
> **Sample Input**
> 
> .MathJax\_SVG\_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax\_SVG .MJX-monospace {font-family: monospace} .MathJax\_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax\_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax\_SVG \* {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue} .MathJax\_SVG\_LineBox {display: table!important} .MathJax\_SVG\_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
> 
>     5 3
>     2 1 8
>     1 0 5
>     2 4 5
>     1 3 4
>     2
>     4
>     0
>     
> 
> **Sample Output**
> 
> .MathJax\_SVG\_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax\_SVG .MJX-monospace {font-family: monospace} .MathJax\_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax\_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax\_SVG \* {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue} .MathJax\_SVG\_LineBox {display: table!important} .MathJax\_SVG\_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
> 
>     10
>     
> 
> **Explanation**
> 
> .MathJax\_SVG\_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax\_SVG .MJX-monospace {font-family: monospace} .MathJax\_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax\_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax\_SVG \* {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue} .MathJax\_SVG\_LineBox {display: table!important} .MathJax\_SVG\_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
> 
> ![image](https://s3.amazonaws.com/hr-assets/0/1528209926-cda6d7fb35-matrixSample.png)
> 
> The machines are located at the cities
> 
> , and . Neo can destroy the green roads resulting in a time of . Destroying the road between cities and instead of between and would work, but it's not minimal.
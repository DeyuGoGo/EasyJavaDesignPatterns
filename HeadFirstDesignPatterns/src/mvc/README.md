##MVC模式
____
MVC模式，簡單的說就是把資料的實際操作包裝到Model中，把控制Model的方法用Controller包裝起來，然後使用View去觸發Model的操作，使之Model跟View有抽換的空間，基礎就是策略模式啦，
整個流程大致是這樣：
1.使用者從View互動。
2.根據View的互動，對應到相對的Controller的Interface
3.controller根據互動決定要改變哪個view或者告知Model做事。
4.model或者view做完事之後再透過Controller決定要不要執行下個動作，像是告知view，Model的變更。
5.View向Model詢問，然後呈現變更後結果的View。
大致是這樣(隨著情況可以方便變更)
____

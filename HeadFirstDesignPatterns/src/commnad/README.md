##命令模式
____
命令模式：將請求封裝成物件，以便使用不同的請求，佇列，或者日誌，參數化其他物件。命令模式也支援可恢復的作業。

可以把一堆要做的事包裝成command物件，放到陣列中一個一個做，把要做的是包裝同一種執行方法，像是go , do , run ,excute讓接受這些command的控制器可以簡單地去告訴該做事的人做事，就像是員工聽到”上班"就會去做他們份內的事，你可以在對的時間叫他們上班也可以一個一個叫(command Q)，而不用知道上班實際內容為何。
____

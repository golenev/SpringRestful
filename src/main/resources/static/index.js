function createCell(row, attr, tr){
   let td = document.createElement('td')
              td.textContent = row[attr]
              tr.appendChild(td)
}

fetch('/api/products') //обращаемся к ресурсу сервера по протоколу http
    .then(response => response.json()) //обработка ответа сервера, превращение в json Объект
    .then(array => { //обрабатываем полученный результат
        const amount = array.length //находим длину массива
        const place = document.querySelector('#amount') //находим место, где хотим видеть число средствами DOM
        const tbody = document.querySelector('tbody')
        place.textContent = amount
        for(const row of array) {
            const tr = document.createElement('tr')
            tbody.appendChild(tr)
           createCell(row, 'id', tr)
           createCell(row, 'isActive', tr)
           createCell(row, 'regionId', tr)
           createCell(row, 'composition', tr)
           createCell(row, 'shortDescription', tr)

        }
    })
const form = document.getElementById('form');

form.addEventListener('submit', async (event) => {
    event.preventDefault();

    const formData = new FormData(form);

    try {
        const response = await fetch('/save', {
            method: 'POST',
            body: formData,
        });

        const data = await response.json(); // Assume que o backend retorna JSON
        document.getElementById('dados').classList.remove('hidden');
        document.getElementById('MainPage').classList.add('hidden');
        document.getElementById('ipNew').innerText = `${data.ip}`;
        document.getElementById('cidrNew').innerText = `${data.cidr}`;
        document.getElementById('ipBin').innerText = `${data.ipBin}`;
        document.getElementById('maskBin').innerText = `${data.maskBin}`;
        document.getElementById('mask').innerText = `${data.mask}`;
        document.getElementById('inMaskBin').innerText = `${data.inMaskBin}`;
        document.getElementById('inMask').innerText = `${data.inMask}`;
        document.getElementById('idBin').innerText = `${data.idBin}`;
        document.getElementById('id').innerText = `${data.id}`;
        document.getElementById('broadcastBin').innerText = `${data.broadcastBin}`;
        document.getElementById('broadcast').innerText = `${data.broadcast}`;

    } catch (error) {
        console.error('Erro ao enviar os dados:', error);
    }
});

document.getElementById('voltar').addEventListener('click', function () {
        // Recarrega a página
        location.reload();
    });

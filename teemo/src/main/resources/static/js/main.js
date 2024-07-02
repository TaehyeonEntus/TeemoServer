// JavaScript 파일에서 toggle 함수 정의
let container = document.getElementById('container');

function toggle() {
    container.classList.toggle('sign-in');
    container.classList.toggle('sign-up');
}

// 초기 상태 설정
setTimeout(() => {
    container.classList.add('sign-in');
}, 200);

// Sign in, Sign up 링크에 클릭 이벤트 추가
document.getElementById('signin-link').addEventListener('click', toggle);
document.getElementById('signup-link').addEventListener('click', toggle);

import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080/api',
});

// Attach Basic Auth from localStorage
api.interceptors.request.use((config) => {
  const username = localStorage.getItem('username');
  const password = localStorage.getItem('password');
  if (username && password) {
    config.headers.Authorization = 'Basic ' + btoa(username + ':' + password);
  }
  return config;
});

export default api;